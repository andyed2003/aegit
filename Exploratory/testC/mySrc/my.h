/*
 * my.h
 *
 *  Created on: 26 Jul 2013
 *      Author: andy
 */

#ifndef MY_H_
#define MY_H_

#include<stdio.h>

typedef int BOOL;
#define TRUE 1
#define FALSE 0

#define Low 800
#define High 2000
#define ComputeDelay 200
#define ReadDelay 20
#define WriteDelay 20

typedef enum environSM_STATES {
	stableSim,
} environSM_STATES;

typedef enum controllerSM_STATES {
	ready,
} controllerSM_STATES;



#endif /* MY_H_ */
