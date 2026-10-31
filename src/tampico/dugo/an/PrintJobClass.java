/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tampico.dugo.an;

/**
 *
 * @author Саня
 */
public class PrintJobClass {
    private int id;
    private String printer;
    private String size;
    private int copies;
    private int pages;
    private String sides;
    private String color;

    public PrintJobClass(int id, String printer, String size,
                int copies, int pages, String sides, String color) {

    this.id = id;
    this.printer = printer;
    this.size = size;
    this.copies = copies;
    this.pages = pages;
    this.sides = sides;
    this.color = color;
}
    public int getId() {
    return id;
}

public String getPrinter() {
    return printer;
}

public String getSize() {
    return size;
}

public int getCopies() {
    return copies;
}

public int getPages() {
    return pages;
}

public String getSides() {
    return sides;
}

public String getColor() {
    return color;
}


}
