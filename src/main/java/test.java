



import org.apache.commons.validator.routines.RegexValidator;




public class test
{
    public static void main(String[] args) {
       test.run("2020-11-29");
        //计数

    }



    static String run(String str)
    {
        boolean caseSensitive = false;
        boolean caseSensitive1 = false;
        String b="^[1-9]\\d{3}-(0[1-9]|1[0-2])-(0[1-9]|[1-2][0-9]|3[0-1])$";
        String c = "^(20|21|22|23|[0-1]\\d):[0-5]\\d:[0-5]\\d$";



        RegexValidator validator1 = new RegexValidator(b, caseSensitive);
        // 验证/转换日期

        RegexValidator validator2 = new RegexValidator(c, caseSensitive1);

        boolean valid = validator1.isValid(str);

        boolean valid1 = validator2.isValid(str);
        if (valid) {
            System.out.println("是日期");
            return "是日期";
        }
        else
        {
            if(valid1)
            {
                System.out.println("是时间");
                return "是时间";
            }
            else
            {
                System.out.println("不是日期也不是时间");
                return "不是日期也不是时间";
            }
        }

    }


}


