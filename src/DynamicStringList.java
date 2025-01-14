public class DynamicStringList implements StringList{
    
    private String[] dynamicArray = new String[10];
    private int counter = 0;

    public String get(int index) {
        if (index < 0 || index > dynamicArray.length) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return dynamicArray[index];
    }

    public void set(int index, String value) {
        if (index < 0 || index > dynamicArray.length) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        dynamicArray[index] = value;
    }

    public void add(String value) {
        dynamicArray[counter] = value;
        counter++;
    }
}
