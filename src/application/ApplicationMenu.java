package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import entities.Product;
import services.ProductServices;

public class ApplicationMenu {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		String path = "C:\\java\\in.txt";
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			while (line != null) {
				String[] words = line.split(",");
				list.add(new Product(words[0], Double.parseDouble(words[1])));
				line = br.readLine();
			}
			Product x = ProductServices.max(list);
			System.out.println("MAX:");
			System.out.println(x);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
