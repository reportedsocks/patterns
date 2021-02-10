package iterator_pattern;

public class Test {
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        PancakeMenuIterator pancakeMenuIterator = pancakeHouseMenu.getIterator();
        while (pancakeMenuIterator.hasNext()) {
            System.out.println(pancakeMenuIterator.next());
        }
    }
}
