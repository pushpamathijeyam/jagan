package org.basic;

import org.body.PayLoad;

import io.restassured.path.json.JsonPath;

public class ComplexJsonDummy {
	public static void main(String[] args) {
		JsonPath js = new JsonPath(PayLoad.courseDetails());

		// 1.Print No of courses returned by API
		int noofcourses = js.getInt("courses.size()");
		System.out.println("No of courses:" + noofcourses);
		// 2.Print Purchase Amount
		int amount = js.getInt("dashboard.purchaseAmount");
		System.out.println("purchase amount" + amount);

		// 3.Print Title of the first course
		String FirstName = js.getString("courses[0].title");
		System.out.println(FirstName);

		// 4.Print All course titles and their respective Prices
		for (int i = 0; i < noofcourses; i++) {
			String AllName = js.getString("courses[" + i + "].title");
			System.out.println(AllName);

			int price = js.getInt("courses[" + i + "].price");
			System.out.println(price);

		}
		// 5. Print no of copies sold by RPA Course
		for (int i = 0; i < noofcourses; i++) {

			String allTitle = js.getString("courses[" + i + "].title");
			if (allTitle.equalsIgnoreCase("rpa")) {
				int copy = js.getInt("courses[" + i + "].copies");
				System.out.println(copy);
			}
		}
		// 6. Verify if Sum of all Course prices matches with Purchase Amount
		int sum = 0;
		for (int i = 0; i < noofcourses; i++) {
			int price = js.getInt("courses[" + i + "].price");
			// System.out.println(price);
			int copy = js.getInt("courses[" + i + "].copies");
			// System.out.println(copy);
			int product = price * copy;
			// System.out.println("product of all course price:" + product);
			sum = sum + product;
		}
		System.out.println("sum of all courses :" + sum);
		System.out.println("purchase Amount:"+amount);
		if (amount == sum) {
			System.out.println("sum of all price courses is equal to purchase price");
		} else {
			System.out.println("sum of all price courses is not equal to purchase price");
		}

	}

}
