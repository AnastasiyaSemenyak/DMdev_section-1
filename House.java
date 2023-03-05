package dmd.section_1;

/**
 * Представить в виде классов и их композиции следующую модель.
 * <p>
 * - Каждый дом содержит свой номер (int), и множество этажей (массив).
 * <p>
 * - Каждый этаж содержит номер этажа (int), и множество квартир (массив).
 * <p>
 * - Каждая квартира содержит свой номер (int), и множество комнат (массив).
 * <p>
 * - Каждая комната содержит поле проходная она или нет (boolean).
 * <p>
 * В каждом классе реализовать метод print, который на консоль выводит информацию об объекте (должны присутствовать все поля объекта!).
 * <p>
 * Например, метод print класса этаж должен выводить на консоль:
 * <p>
 * “Этаж 2, количество квартир 18”
 * <p>
 * Создание всех объектов вынести в отдельный класс с методом main.
 * <p>
 * Там же реализовать метод printAllInformation, который на вход принимает объект типа дом, и выводит информацию о нем, его этажах, квартирах и комнатах, вызывая методы print.
 */
public class House {
    private int number;
    private Floor[] floors;

    House(int number, Floor[] floors) {
        this.number = number;
        this.floors = floors;
    }

    public void print() {
        System.out.println("House: " + number + ", floors: " + floors.length);
    }

    public void printAllInformation(House house) {
        print();
        for (int i = 0; i < house.floors.length; i++) {
            house.floors[i].print();
            for (int j = 0; j < house.floors[i].flats.length; j++) {
                house.floors[i].flats[j].print();
                for (int f = 0; f < house.floors[i].flats[j].rooms.length; f++) {
                    house.floors[i].flats[j].rooms[f].print();
                }
            }
        }
    }
}


class HouseRunning{
    public static void main(String[] args) {
        Room room1=new Room(true);
        Room room2=new Room(false);

        Flat flat1=new Flat(83,new Room[]{room1,room2});
        Flat flat2=new Flat(21,new Room[]{room1,room1,room1});

        Floor floor1=new Floor(2, new Flat[]{flat1, flat2});
        Floor floor2=new Floor(1,new Flat[]{flat1,flat1});

        House house=new House(22,new Floor[]{floor1, floor2});

        String string="sfg";









      //  house.print();
        house.printAllInformation(house);
    }
}