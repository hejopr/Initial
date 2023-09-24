public class Laba1
{
    public static class Posyda
    {
        protected String proizvod;
        protected int price;
        protected String style;
        protected String name;

        public Posyda(String proizvod, String style, int price)
        {
            this.proizvod = proizvod;
            this.style = style;
            this.price = price;
        }
        public Posyda(String style)
        {
            this.style = style;
        }
        public Posyda() {}
        public String GetProizvod() {return proizvod;}
        public int GetPrice() {return price;}
        public String GetStyle() {return style;}
        public String GetName() {return name;}
        public void Name() {}

        public void GetInfo()
        {
            System.out.println("Наименование: " +GetName()+ "\nСтиль: " +GetStyle()+ "\nПроизводитель: " +GetProizvod()+ "\nЦена: " + GetPrice());
        }

    }

    public static class Kastrulya extends Posyda
    {
        public Kastrulya(String proizvod, String style, int price)
        {
            super(style);
            this.proizvod = proizvod;
            this.price = price;
            name = "kastr";
        }
        public Kastrulya(String style)
        {
            this.style = style;
            this.proizvod = "TEFAL";
            this.price = 76;
        }
        public void Name()
        {
            name = "Kastrulya";
        }
    }
    public static class Skovoroda extends Posyda
    {
        public String size;
        public Skovoroda(String proizvod, String style, int price, String size)
        {
            super(proizvod, style, price);
            this.size = size;
        }
        public Skovoroda(String style)
        {
            this.style = style;
            this.proizvod = "dps";
            this.price = 43;
        }
        public void Name()
        {
            name = "Skovoroda";
        }
    }
    public static class Tarelka extends Posyda
    {
        public Tarelka(String proizvod, String style, int price)
        {
            super(style);
            this.proizvod = proizvod;
            this.price = price;
        }
        public Tarelka(String style)
        {
            this.style = style;
            this.proizvod = "Dekostek";
            this.price = 17;
        }
        public void Name()
        {
            name = "Tarelka";
        }
    }

    public static void main(String[] args)
    {
        Kastrulya ks = new Kastrulya("GIPFEL", "Japanese", 80);
        ks.Name();
        ks.GetInfo();
        Skovoroda sv = new Skovoroda("Kukmara", "Modern", 45, "Big");
        sv.Name();
        sv.GetInfo();
        Tarelka tl = new Tarelka("Minimalizm");
        tl.Name();
        tl.GetInfo();
    }
}
