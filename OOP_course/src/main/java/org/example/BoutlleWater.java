package org.example;// //  Сделать класс Товар абстрактным,
// создать нескольких наследников 
// (к примеру: БутылкаВоды), 
// сделать интерфейсом ТорговыйАвтомат 
// и реализовать класс какого-то одного типа 
// ТорговогоАвтомата (пример: ПродающийБутылкиВодыАвтомат   

public class BoutlleWater extends Product
{
    BoutlleWater (String name, int cost) 
    {
        this.name = name;
        this.cost = cost;
        this.productType = "Boutlle";
    }    
}

