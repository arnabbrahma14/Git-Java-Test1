import java.io.*;


class Test {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Hello Git Hub");

		System.out.println("Enter Name:");
		String name = br.readLine();

		System.out.println("Enter Age:");
		int age = Integer.parseInt(br.readLine());

		System.out.println("Name: " + name + " Age: " + age);

	}
}