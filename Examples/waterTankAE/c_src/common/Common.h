#ifndef COMMON_H
#define COMMON_H
#include<stdio.h>
#define TRUE 1
typedef int BOOL;
#define FALSE 0

#define Low 800
#define High 2000
#define ComputeDelay 200
#define ReadDelay 20
#define WriteDelay 20

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

