package com.AngelOlvera;

public class MegabyteConverter {
    private int kilobytes=0;

    public MegabyteConverter(int kilobytes)throws Exception{
        if(kilobytes>0){
            this.kilobytes=kilobytes;
        }else{
            System.out.println("Kilobytes cannot be less than or equal to 0");
            throw new Exception();
        }
    }
    public int getKilobytes() {
        return kilobytes;
    }

    public void setKilobytes(int kilobytes) throws Exception{
        if(kilobytes>=0){
            this.kilobytes = kilobytes;
        }else{
            System.out.println("Kilobytes cannot be less than or equal to 0");
            throw new Exception();
        }
    }


    public static void printMegaBytesAndKiloBytes(int kilobytes) throws Exception{

        if (kilobytes<=0){
            System.out.println("Kilobytes cannot be 0 or less");
            throw new Exception();
        }

       else if(kilobytes%1024==0){
            System.out.println( kilobytes + " KB = " + kilobytes/1024 + " MB ");
        }else{
            System.out.println( kilobytes + " KB = " + kilobytes/1024 + " MB " +"and " + kilobytes%1024 + " KB ");
        }
    }
}
