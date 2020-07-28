package example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 * Filtering operations
 * 
 */

public class Example5 {
	
	public static void main(String[] args) {
		
		List<Dish> menu=Dish.menu;
		List<Dish> vegeterianMenu=
				menu.stream()
				.filter(Dish::isVegetarian)
				.collect(Collectors.toList());
		
		
		
		List<Integer> numbers=List.of(1,2,1,3,3,2,4);
		numbers
		.stream()
		.filter(i->i%2==0)
		.distinct()
		.forEach(System.out::println);
		
		
		
		
		List<Dish> specialMenu=Arrays.asList(
						  new Dish("season fruit", true, 120, Dish.Type.OTHER),
						  new Dish("chicken", false, 400, Dish.Type.MEAT),
						  new Dish("french fries", true, 530, Dish.Type.OTHER),
						  new Dish("beef", false, 700, Dish.Type.MEAT),
						  new Dish("pork", false, 800, Dish.Type.MEAT)
				);
		
		
		List<Dish> fiteredMenu=
				              specialMenu
				              .stream()
				              .dropWhile(dish->dish.getCalories()<500)
				              .collect(Collectors.toList());
		
		fiteredMenu
		.forEach(System.out::println);
		
		
		
		
		menu
		.stream()
		//.limit(2)
		.skip(1)
		.forEach(System.out::println);
		
		
	}

}
