package com.meditab.training.ocp.exercise_refactored;


interface Resource_Interface {
	void markTimeSlotFree(int resourceId);

	void markSpaceSlotFree(int resourceId);

	void markSpaceSlotBusy(int resourceId);

	int findFreeSpaceSlot();

	void markTimeSlotBusy(int resourceId);

	int findFreeTimeSlot();
}

