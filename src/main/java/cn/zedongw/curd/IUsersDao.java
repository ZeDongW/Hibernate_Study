package cn.zedongw.curd;

import cn.zedongw.demo.entity.Users;

import java.io.Serializable;
import java.util.List;

/**
 * 用户数据访问层接口
 */
public interface IUsersDao {

    /** @MethodName: save
     * @Description: 新增用户
     * @Param: [user]
     * @Return: void
     * @Author: ZeDongW
     * @Date: 2020/3/12 0012 11:36
     **/
    void save(Users user);

    /** @MethodName: update
     * @Description: 更新用户
     * @Param: [user]
     * @Return: void
     * @Author: ZeDongW
     * @Date: 2020/3/12 0012 11:36
     **/
    void update(Users user);

    /** @MethodName: findById
     * @Description: 根据id查找用户
     * @Param: [id]
     * @Return: cn.zedongw.demo.entity.Users
     * @Author: ZeDongW
     * @Date: 2020/3/12 0012 11:36
     **/
    Users findById(Serializable id);

    /** @MethodName: getAll
     * @Description: 查找所有用户
     * @Param: []
     * @Return: java.util.List<cn.zedongw.demo.entity.Users>
     * @Author: ZeDongW
     * @Date: 2020/3/12 0012 11:52
     **/
    List<Users> getAll();

    /** @MethodName: getAll
     * @Description: 根据用户名查找所有用户
     * @Param: [UsersName]
     * @Return: java.util.List<cn.zedongw.demo.entity.Users>
     * @Author: ZeDongW
     * @Date: 2020/3/12 0012 11:54
     **/
    List<Users> getAll(String userName);

    /** @MethodName: getAll
     * @Description: 分页查询
     * @Param: [index, count]
     * @Return: java.util.List<cn.zedongw.demo.entity.Users>
     * @Author: ZeDongW
     * @Date: 2020/3/12 0012 11:55
     **/
    List<Users> getAll(int index, int count);

    /** @MethodName: delete
     * @Description: 删除用户
     * @Param: [id]
     * @Return: void
     * @Author: ZeDongW
     * @Date: 2020/3/12 0012 11:55
     **/
    void delete(Serializable id);
}
