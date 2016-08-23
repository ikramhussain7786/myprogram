public class rev{
public static void main(String ars[])
{
String s = "We_are_at__DirectCreate";
String[] split = s.split("_");
String result = "";
int aa=split.length;
for (int i = split.length - 1; i >= 0; i--) {
	if(i==4)
	{
  result += (split[i]+"");
  result+="__";
	}
	else{
		 result+= ("_"+split[i]+"");
	}
}
System.out.println(result.trim());
}
}