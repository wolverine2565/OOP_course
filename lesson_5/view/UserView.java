package homeLesson5.view;

import homeLesson5.controller.UserController;

// Реализовать систему работы банковского приложения.
// - Создать класс пользователь и соответсвующие классы
// - Реализовать операции зачисления средств пользователю на счет и списания(У пользователя должно быть отдельное поле - его балланс)
// - Реализовать функции добавления и удаления пользователя

import java.util.Scanner;

public class UserView {
    public static void main(String[] args) {
        UserController userController = new UserController();

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Введите номер счета и имя пользователя");
        userController.saveUser(sc.nextInt(), sc.next());
        System.out.println("Введите номер счета и имя пользователя");
        userController.saveUser(sc.nextInt(), sc.next());
        System.out.println(userController.getUserList());
        
        System.out.println("Введите имя пользователя и сумму зачисления");
        userController.inDeposits(sc.next(), sc.nextDouble());
        System.out.println(userController.getUserList());
        System.out.println("Введите имя пользователя и сумму списания");
        userController.outDeposits(sc.next(), sc.nextDouble());
        System.out.println(userController.getUserList());
        
        System.out.println("Введите имя удаляемого пользователя");
        userController.removeUser(sc.next());
        System.out.println(userController.getUserList());

        sc.close();
    }
}
