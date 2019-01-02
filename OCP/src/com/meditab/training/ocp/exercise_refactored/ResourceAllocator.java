package com.meditab.training.ocp.exercise_refactored;

public class ResourceAllocator {

	private static final int INVALID_RESOURCE_ID = -1;
	ResourceAvailability RES_AVAIL;
	public int allocate(ResourceType resourceType) {
		int resourceId;
		switch (resourceType) {
		case TIME_SLOT:
			resourceId = RES_AVAIL.findFreeTimeSlot();
			RES_AVAIL.markTimeSlotBusy(resourceId);
			break;
		case SPACE_SLOT:
			resourceId = RES_AVAIL.findFreeSpaceSlot();
			RES_AVAIL.markSpaceSlotBusy(resourceId);
			break;
		default:
			System.out.println("ERROR: Attempted to allocate invalid resource");
			resourceId = INVALID_RESOURCE_ID;
			break;
		}
		return resourceId;
	}
}
