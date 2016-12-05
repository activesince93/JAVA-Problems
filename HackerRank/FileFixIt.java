import java.util.ArrayList;
import java.util.Scanner;

public class FileFixIt {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		for (int i = 0; i < testCases; i++) {
			int createdFiles = sc.nextInt();
			int remainingFiles = sc.nextInt();
			sc.nextLine();
			ArrayList<String> createdFilesList = new ArrayList<>();
			ArrayList<String> remainingFilesList = new ArrayList<>();
			for (int j = 0; j < createdFiles; j++) {
				createdFilesList.add(sc.nextLine());
			}
			for (int j = 0; j < remainingFiles; j++) {
				remainingFilesList.add(sc.nextLine());
			}

			System.out.println("Case #" + (i + 1) + ": " + getNoOfFilesToCreate(createdFilesList, remainingFilesList));
		}
	}

	private static int getNoOfFilesToCreate(ArrayList<String> createdFilesList, ArrayList<String> remainingFilesList) {
		int total = 0;
		for (int i = 0; i < remainingFilesList.size(); i++) {
			String filePath = remainingFilesList.get(i);
			int noOfFilesToCreate = getFilesToCreate(filePath, createdFilesList);
			total += noOfFilesToCreate;
			if (noOfFilesToCreate != 0) {
				createdFilesList.add(filePath);
			}
		}
		return total;
	}

	private static int getFilesToCreate(String filePath, ArrayList<String> createdFilesList) {
		if (createdFilesList.size() > 0) {
			for (int i = 0; i < createdFilesList.size(); i++) {
				String filePath1 = filePath.substring(1);
				String createdFilePath = createdFilesList.get(i).substring(1);
				while (!filePath1.equals("") || !createdFilePath.equals("")) {
					if (createdFilePath.substring(0, (createdFilePath.contains("/")) ? createdFilePath.indexOf("/") : createdFilePath.length())
							.equals(filePath1.substring(0, (filePath1.contains("/")) ? filePath1.indexOf("/") : filePath1.length()))) {
						createdFilePath = (createdFilePath.contains("/")) ? createdFilePath.substring(createdFilePath.indexOf("/") + 1) : "";
						filePath1 = (filePath1.contains("/")) ? filePath1.substring(filePath1.indexOf("/") + 1) : "";
					} else {
						return ((!filePath1.equals("")) ? (filePath1.split("/").length) : 0);
					}
				}
			}
			return 0;
		} else {
			return filePath.substring(1).split("/").length;
		}
	}
}
