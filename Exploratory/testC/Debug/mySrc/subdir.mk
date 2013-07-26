################################################################################
# Automatically-generated file. Do not edit!
################################################################################

# Add inputs and outputs from these tool invocations to the build variables 
C_SRCS += \
../mySrc/controllerImpl.c \
../mySrc/environmentImpl.c \
../mySrc/my.c 

OBJS += \
./mySrc/controllerImpl.o \
./mySrc/environmentImpl.o \
./mySrc/my.o 

C_DEPS += \
./mySrc/controllerImpl.d \
./mySrc/environmentImpl.d \
./mySrc/my.d 


# Each subdirectory must supply rules for building sources it contributes
mySrc/%.o: ../mySrc/%.c
	@echo 'Building file: $<'
	@echo 'Invoking: GCC C Compiler'
	gcc -O0 -g3 -Wall -c -fmessage-length=0 -MMD -MP -MF"$(@:%.o=%.d)" -MT"$(@:%.o=%.d)" -o "$@" "$<"
	@echo 'Finished building: $<'
	@echo ' '


