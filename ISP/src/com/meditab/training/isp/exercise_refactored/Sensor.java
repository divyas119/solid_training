package com.meditab.training.isp.exercise_refactored;

import java.util.Random;

public class Sensor implements IDoorRegister {
		public void register(Door door) {
			while (true) {
				if (isPersonClose()) {
					door.proximityCallback();
					break;
				}
			}
		}

		private boolean isPersonClose() {
			return new Random().nextBoolean();
		}
	}

