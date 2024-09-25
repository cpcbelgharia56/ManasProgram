
class Welcome
{
    public static void main(String[] args) {
        String str = "192.168.10.92";
        convertToIpv6(str);
    }

    public static void convertToIpv6(String str) {
        String arr[] = str.split("\\.");
        int i = 1;
        String result = "::FFFF";
        String s1="", s2="";
        for(String s : arr)
        {
            String hexa = "";
            int num = Integer.parseInt(s);

            while(num > 0)
            {
                int d = num%16;
                if(d > 9)
                {
                    hexa += (char)(d+55);
                }
                else{
                    hexa += d;
                }
                num=num/16;
            }
            String st = "";
            if(hexa.length()==1)
            {
                hexa += "0"+hexa;
            }          
           
                      
            if(i==1 || i==2)
            {
                st = new StringBuilder(hexa).reverse().toString();
                s1+=st;
            }
            else{
                if(i==4)
                    st = new StringBuilder(hexa).reverse().toString();
                else
                    st = new StringBuilder(hexa).toString();
                s2+=st;
            }
            i++;
        }
        result+=":"+s1+":"+s2.substring(1);
        System.out.println(result);
    }

    public static int last_animal_name_length(String str) {

        String name = "";
        String result = "";
        for(int i=0; i<str.length(); i++)
        {
            char ch = str.charAt(i);
            if(ch == '-')
            {
                result = name;
                name = "";
            }
            else{
                name += ch;
            }
        }
        return result.length();
    }
} 