package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import models.entities.Products;

public class Program {

	public static void main(String[] args){
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Products> products = new ArrayList<>();
		System.out.print("Enter full file path: ");
		try {
			FileReader fr = new FileReader(sc.next());
			BufferedReader bf = new BufferedReader(fr);
			String lines = bf.readLine();
			while(lines!=null) {
				String[] aux = lines.split(",");
				Products pr = new Products(aux[0], Double.parseDouble(aux[1]));
				products.add(pr);
				lines = bf.readLine();
			}
			System.out.println("Products: ");
			products.forEach(System.out::println);
			Double average = products.stream().map(p->p.getPrice()).reduce(0.0,(p1,p2)->p1+p2)/products.size();
			List<Products> filtredList =  products.stream().filter(x->x.getPrice()>=average).collect(Collectors.toList());
			System.out.print("\nAverage price: " + String.format("%.2f", average));
			System.out.println("\nFiltred products (Price>=Average): ");
			filtredList.forEach(System.out::println);
		}catch (IOException e) {
			// TODO: handle exception
			System.out.println("ERROR! File is not found " + e.getMessage());
		}
		sc.close();
	}

}
