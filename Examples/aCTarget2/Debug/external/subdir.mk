################################################################################
# Automatically-generated file. Do not edit!
################################################################################

# Add inputs and outputs from these tool invocations to the build variables 
C_SRCS += \
../external/mymain.c 

OBJS += \
./external/mymain.o 

C_DEPS += \
./external/mymain.d 


# Each subdirectory must supply rules for building sources it contributes
external/%.o: ../external/%.c
	@echo 'Building file: $<'
	@echo 'Invoking: GCC C Compiler'
	gcc -I/home/andy/git/aegit/Examples/aCTarget2/external -I/home/andy/git/aegit/Examples/aCTarget2/src -O0 -g3 -Wall -c -fmessage-length=0 -MMD -MP -MF"$(@:%.o=%.d)" -MT"$(@:%.o=%.d)" -o "$@" "$<"
	@echo 'Finished building: $<'
	@echo ' '


