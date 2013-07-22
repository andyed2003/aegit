#ifndef COMMON_H
#define COMMON_H
#include<stdio.h>
#define TRUE 1
typedef int BOOL;
#define FALSE 0
void __SLEEP(int period);
#include<omp.h>



typedef enum environSM_STATES
{
	stableSim,
} environSM_STATES;


typedef enum controllerSM_STATES
{
	ready,
} controllerSM_STATES;




#include "controllerImpl.h"
#include "environmentImpl.h"
#endif

