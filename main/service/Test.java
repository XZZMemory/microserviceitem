package service;

import org.apache.commons.lang3.StringUtils;
import service.dto.User;
import service.dto.UserA;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        User a=new User(1,"xiao");
        Map<String,Object> map=new HashMap<>();
        map.put("user",a);
        UserA userA=(UserA)map.get("user");


        String str=null;
        StringUtils.isEmpty(str);
       /* List<User> userList = null;
        Map<Integer,User> userMap=userList.
                stream().
                collect(Collectors.toMap(User::getId,Function.identity()));
*/

        List<User> userList1=new LinkedList<>();
        userList1.add(new User(1,"yi"));
        userList1.add(new User(1,"er"));
        Map<Integer,User> userMap1=userList1.stream().collect(
                Collectors.toMap
                        (User::getId,
                                (user) -> user,(o,n)->o
                        )
        );

    }
}
