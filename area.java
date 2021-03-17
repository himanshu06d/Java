
class area 
    {
        int width;
        int length;
        int height;
        area() 
        {
        width = 5;
        length = 6;
        height = 1;
        }
        void volume() 
        {
             volume = width * height * length;
        } 
    }    
    class cons_method 
    {
        public static void main(String args[]) 
        {
            area obj = new area();
            obj.volume();
            System.out.println(obj.volume);
        } 
    }