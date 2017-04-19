import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class RopeIntranet {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		for (int i = 0; i < testCases; i++) {
			int noOfWires = sc.nextInt();
			ArrayList<CustomObject> customObjectArrayList = new ArrayList<>();
			for(int j = 0; j < noOfWires; j++) {
				CustomObject customObject = new CustomObject();
				customObject.setBuildingA(sc.nextInt());
				customObject.setBuildingB(sc.nextInt());
				customObjectArrayList.add(customObject);
			}
			Collections.sort(customObjectArrayList, customComparator);
			int count = 0;
			for(int j = 0; j < customObjectArrayList.size() - 1; j++) {
				for(int k = j + 1; k < customObjectArrayList.size(); k++) {
					if(customObjectArrayList.get(j).getBuildingB() > customObjectArrayList.get(k).getBuildingB()) {
						count += 1;
					}
				}
			}
			System.out.println("Case #" + (i + 1) + ": " + count);
		}
		sc.close();
	}
	
	static Comparator<CustomObject> customComparator = new Comparator<CustomObject>() {

		@Override
		public int compare(CustomObject o1, CustomObject o2) {
			if(o1.getBuildingA() < o2.getBuildingA()) {
				return -1;
			} else if(o1.getBuildingA() > o2.getBuildingA()) {
				return 1;
			} else {
				return 0;
			}
		}
	};

	private static class CustomObject {
		int buildingA;
		int buildingB;

		public int getBuildingA() {
			return buildingA;
		}

		public int getBuildingB() {
			return buildingB;
		}

		public void setBuildingA(int buildingA) {
			this.buildingA = buildingA;
		}

		public void setBuildingB(int buildingB) {
			this.buildingB = buildingB;
		}
	}
}
