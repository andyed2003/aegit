MACHINE controller 
SETS
    PC = {read, compute, write};
    LPC = {lread, ldecide, lwrite}

VARIABLES
        fmiLevel,
        fmiPump,
        level ,
        time  ,
        pump ,
        pc   ,
        lpc  

CONSTANTS 
   High, Low, ReadDelay, WriteDelay, ComputeDelay

PROPERTIES
   High = 2000 & Low = 800 & ReadDelay = 20 & WriteDelay= 20 &  ComputeDelay = 100          

INVARIANT
         time : 0..12000 &
         pump : BOOL &
         level : 0..20000 &
         fmiLevel : NATURAL &
         fmiPump : BOOL &
         pc : PC &
         lpc : LPC 

INITIALISATION 
                time :=  0 ||
                level :=  0  ||
                pump :=  TRUE  ||
                fmiLevel :: NATURAL  ||
                fmiPump :: BOOL  ||
                pc :=  read  ||
                lpc :=  lread 

OPERATIONS


    fmiReadInputs(l) =
            PRE   l : NATURAL & /* l : {500,1000,1500,2000,2500} & */
                  pc = read 
            THEN
                  fmiLevel :=  l ||
                  pc :=  compute 
            END;

    fmiWriteOutputs =
    PRE
         pc = write 
    THEN
         fmiPump :=  pump ||
         pc :=  read 
    END;        

    decide = 
        PRE
            pc = compute &
            lpc = ldecide 
        THEN
           IF level>High THEN pump := FALSE
            ELSIF level < Low THEN pump := TRUE END || 
           time :=  time + ComputeDelay ||
           lpc :=  lwrite 
        END;

    readLevel = 
        PRE
              lpc = lread &
              pc = compute 
        THEN
              level :=  fmiLevel ||
              time :=  time + ReadDelay ||
              lpc :=  ldecide 
        END;

    writePump = 
        PRE
               pc = compute  &
               lpc = lwrite 
        THEN
             time :=  time + WriteDelay ||
             pc :=  write ||
             lpc :=  lread 
        END

    END
