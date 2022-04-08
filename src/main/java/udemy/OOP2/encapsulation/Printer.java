package udemy.OOP2.encapsulation;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex){
        this.tonerLevel=tonerLevel;
        if (this.tonerLevel<=-1 || this.tonerLevel>100)
            this.tonerLevel=-1;

        this.duplex=duplex;
        this.pagesPrinted=0;
    }
    public int addToner(int tonerAmount){
        if (tonerAmount>0 && tonerAmount<=100){
            if(this.tonerLevel+tonerAmount<=100)
                return this.tonerLevel=this.tonerLevel + tonerAmount;
            else
                return -1;
        }else
            return -1;
    }
    public int printPages(int pages){
        int pagesToPrint=pages;
        if(this.duplex)
            pagesToPrint = pagesToPrint /2;

        this.pagesPrinted = this.pagesPrinted +pagesToPrint;
        return pagesToPrint;
    }
    public int getPagesPrinted(){
        return pagesPrinted;
    }
}

