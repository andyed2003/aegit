#include "config.h"
#include "fakeFMIDecls.h"

#include <stdio.h>
#include <stdlib.h>

fmiComponent *modelInstances[MaxFMUInstances]; // start of with an empty array of components
int conInstanceCount = 0;

//## <variableDeclarations>  -- generate variable declarations here

//## <fmiInstantiate.c>     -- expand template here

// Subroutines Generated from Events

//## <subroutineList>		-- generate subroutine implementations here


