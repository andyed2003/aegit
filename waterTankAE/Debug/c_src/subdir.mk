################################################################################
# Automatically-generated file. Do not edit!
################################################################################

# Add inputs and outputs from these tool invocations to the build variables 
C_SRCS += \
../c_src/MainEntry.c \
../c_src/controllerImpl.c \
../c_src/environmentImpl.c 

OBJS += \
./c_src/MainEntry.o \
./c_src/controllerImpl.o \
./c_src/environmentImpl.o 

C_DEPS += \
./c_src/MainEntry.d \
./c_src/controllerImpl.d \
./c_src/environmentImpl.d 


# Each subdirectory must supply rules for building sources it contributes
c_src/%.o: ../c_src/%.c
	@echo 'Building file: $<'
	@echo 'Invoking: GCC C Compiler'
	gcc -O0 -g3 -Wall -c -fmessage-length=0 -fPIC -MMD -MP -MF"$(@:%.o=%.d)" -MT"$(@:%.o=%.d)" -o "$@" "$<"
	@echo 'Finished building: $<'
	@echo ' '


