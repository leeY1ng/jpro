import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Dongtaidaili
 */
public class Dongtaidaili {

    public static void main(String[] args) {
        InvocationHandler handler = new InvocationHandler(){
        
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                 System.out.println(method);
                //  System.out.println(proxy.toString());
                 if (method.getName().equals("morning")) {
                     System.out.println("good morning! "+args[0]+args[1]);
                 }
                 return null;
            }
        };

        Hello hello = (Hello)Proxy.newProxyInstance(Hello.class.getClassLoader(), new Class[]{Hello.class}, handler);
        hello.morning("summerSpring", 12);
    }
}

interface Hello {
    void morning(String name, int age);
}

// class HelloDynamicProxy implements Hello {
//     InvocationHandler handler;
//     public HelloDynamicProxy(InvocationHandler handler){
//         this.handler = handler;
//     }

//     public void morning(String name){
//         handler.invoke(this, Hello.class.getMethod("morning"), new Object[]{name});
//     }
// }