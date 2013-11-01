//## <addToHeader>
fmiComponent fmiInstantiateSlave(fmiString instanceName, fmiString fmuGUID,
		fmiString fmuResourceLocation, const fmiCallbackFunctions* functions,
		fmiBoolean visible, fmiBoolean loggingOn) {
	// create a fmiComponent and allocate storage space
	fmiComponent c ;
	if (!(conInstanceCount <= (MaxFMUInstances - 1))) {
		c.validInstance = fmiFalse;
		return c;
	} else {
		c.validInstance = fmiTrue;
		// set the name etc
		c.fmuInstanceName = instanceName;
		c.fmuGUID = fmuGUID;
		//add instance to collection;
		modelInstances[conInstanceCount] = c;
		conInstanceCount = conInstanceCount + 1;
		return c;
	}
}
