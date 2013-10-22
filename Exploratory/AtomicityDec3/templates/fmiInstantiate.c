fmiComponent *fmiInstantiateControllerImpl(fmiString instanceName,
		fmiString GUID) {
	// create a fmiComponent and allocate storage space
	fmiComponent *newFMIComponent = malloc(sizeof(*newFMIComponent));
	if (!(conInstanceCount <= (MaxFMUInstances - 1))) {
		newFMIComponent->validInstance = fmiFalse;
		return newFMIComponent;
	} else {
		newFMIComponent->validInstance = fmiTrue;
		// set the name etc
		newFMIComponent->fmuInstanceName = instanceName;
		newFMIComponent->fmuGUID = GUID;

		//## <initialisationsList>

		//## <stateMachineProgramCounterIni>
		//add instance to collection;
		modelInstances[conInstanceCount] = newFMIComponent;
		conInstanceCount = conInstanceCount + 1;
		return newFMIComponent;
	}
}
