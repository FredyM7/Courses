package org.fmunera.recursion.example;

import org.fmunera.recursion.example.models.Component;

import java.util.stream.Stream;

public class RecursionExample {
    public static void main(String[] args) {

        Component pc = new Component("Gabinete PC ATX");
        Component power = new Component("Fuente de poder 700w");
        Component keyboard = new Component("Teclado");
        Component mouse = new Component("Mouse");
        Component motherBoard = new Component("MainBoard Asus sockets AMD");
        Component ram = new Component("Memoria Ram 32GB");
        Component ssd = new Component("Disco SSD 2T");
        Component cpu = new Component("Cpu AMD Ryzen 5 2800");
        Component cpuFan = new Component("Ventilador CPU");
        Component heatsink = new Component("Disipador");
        Component graphicsCard = new Component("Nvidia RTX 3080 8GB");
        Component gpu = new Component("Nvidia GPU RTX");
        Component gpuRam = new Component("4GB Ram");
        Component gpuRam2 = new Component("4GB Ram");
        Component gpuFans = new Component("Ventiladores");

        cpu.addComponent(cpuFan)
                .addComponent(heatsink);

        graphicsCard.addComponent(gpu)
                .addComponent(gpuRam)
                .addComponent(gpuRam2)
                .addComponent(gpuFans);

        motherBoard.addComponent(cpu)
                .addComponent(graphicsCard)
                .addComponent(ram)
                .addComponent(ssd);

        pc.addComponent(motherBoard)
                .addComponent(power)
                .addComponent(keyboard)
                .addComponent(mouse);


        recursiveMethodJava8(pc, 0).forEach(c -> System.out.println("\t".repeat(c.getLevel()) + c.getName()));
    }

    public static Stream<Component> recursiveMethodJava8(Component c, int level){

        c.setLevel(level);

        return Stream.concat(Stream.of(c)
        , c.getChildren().stream().flatMap(child -> recursiveMethodJava8(child, level+1)));

    }

    public static void recursiveMethod(Component c, int level){
        System.out.println("\t".repeat(level) + "*".repeat(level) + c.getName());

        if(c.hasChildren()){
            for(Component child: c.getChildren()){
                recursiveMethod(child, level++);
            }
        }
    }
}
