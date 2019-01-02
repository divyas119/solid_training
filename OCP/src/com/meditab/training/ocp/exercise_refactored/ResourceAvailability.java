package com.meditab.training.ocp.exercise_refactored;


public class ResourceAvailability implements Resource_Interface {

	public void free(ResourceType resourceType, int resourceId) {
		switch (resourceType) {
		case TIME_SLOT:
			markTimeSlotFree(resourceId);
			break;
		case SPACE_SLOT:
			markSpaceSlotFree(resourceId);
			break;
		default:
			System.out.println("ERROR: attempted to free invalid resource");
			break;
		}
	}

	public void markSpaceSlotFree(int resourceId) {
	}

	public void markTimeSlotFree(int resourceId) {
	}

	public void markSpaceSlotBusy(int resourceId) {
	}

	public int findFreeSpaceSlot() {
		return 0;
	}

	public void markTimeSlotBusy(int resourceId) {
	}

	public int findFreeTimeSlot() {
		return 0;
	}
}


