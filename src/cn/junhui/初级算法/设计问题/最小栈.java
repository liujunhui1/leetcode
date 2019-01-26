package 初级算法.设计问题;


import static java.lang.System.arraycopy;

/**
 * 军辉
 * 2018-11-17 9:31
 * <p>
 * <p>
 * 设计一个支持 push，pop，top 操作，并能在常数时间内检索到最小元素的栈。
 * 在常数时间内检索到最小值 ---->以空间换时间
 * <p>
 * push(x) -- 将元素 x 推入栈中。
 * pop() -- 删除栈顶的元素。
 * top() -- 获取栈顶元素。
 * getMin() -- 检索栈中的最小元素。
 * 示例:
 * <p>
 * MinStack minStack = new MinStack();
 * minStack.push(-2);
 * minStack.push(0);
 * minStack.push(-3);
 * minStack.getMin();   --> 返回 -3.
 * minStack.pop();
 * minStack.top();      --> 返回 0.
 * minStack.getMin();   --> 返回 -2.
 */
public class 最小栈 {
    public static void main(String[] args) {

        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.top());

        System.out.println(minStack.getMin());


    }

}

class MinStack {
    private final static int DEFAULT_SIZE = 1000;//默认大小
    private int[] stack;
    private int[] minIndex;//保存前n个数据中栈最小元素的下标
    private int min = Integer.MAX_VALUE;//记录插入过程中的最小数据
    private int index = -1;//记录最小元素在stack中的位置
    private int current = -1;

    public MinStack() {
        stack = new int[DEFAULT_SIZE];
        minIndex = new int[DEFAULT_SIZE];
    }

    /*
    将元素 x 推入栈中。
     */
    public void push(int x) {
        current++;
        if (current >= stack.length) {//扩容
            int[] tmp = new int[current * 2];
            arraycopy(stack, 0, tmp, 0, stack.length);
            /*将指定原数组中的数组从指定位置复制到目标数组的指定位置
             * (源数组，源数组的起始位置，目标数组，目标数组的起始位置，要复制数组元素的数量)
             */
            stack = tmp;

            tmp = new int[current * 2];
            arraycopy(minIndex, 0, tmp, 0, minIndex.length);
            minIndex = tmp;
        }

        stack[current] = x;//插入数据

        if (x < min) {//保存插入最小值
            min = x;
            index = current;//记录[0,current]中最小元素下标为index
        }

        minIndex[current] = index;
    }

    /*
    删除栈顶的元素。
     */
    public void pop() {
        current--;
        if (current >= 0) {
            min = stack[minIndex[current]];//重新设置栈中的最小值
            index = minIndex[current];//重置最小值的索引
        }
    }

    /*
     获取栈顶元素
     */
    public int top() {
        if (current < 0) {
            throw new RuntimeException("没有数据");
        }
        return stack[current];
    }

    /*
    检索栈中的最小元素
     */
    public int getMin() {
        if (current < 0) {
            throw new RuntimeException("NO more data");
        }
        return stack[minIndex[current]];
    }
}
/*
class MinStack {

    private final static int DEFAULT_SIZE = 1000;
    private int[] stack;
    private int[] minIndex; // 用于保存前n个数据的栈中最小元素的下标
    private int min = Integer.MAX_VALUE; // 用于记录插入过程中的最小数据
    private int index = -1; // 记录最小元素在stack中的位置
    private int current = -1;

    public MinStack() {
        stack = new int[DEFAULT_SIZE];
        minIndex = new int[DEFAULT_SIZE];
    }

    public MinStack(int size) {
        stack = new int[size];
        minIndex = new int[size];
    }

    public void push(int x) {
        current++; // 移动到要插入的位置

        if (current >= stack.length) { // 扩容
            int[] tmp = new int[current * 2];
            System.arraycopy(stack, 0, tmp, 0, stack.length);
            stack = tmp;

            tmp = new int[current * 2];
            System.arraycopy(minIndex, 0, tmp, 0, minIndex.length);
            minIndex = tmp;
        }

        stack[current] = x; // 插入数据

        if (x < min) { // 保存插入的最小值
            min = x;
            index = current; // 记录[0, current]中最小的元素下标是index
        }

        minIndex[current] = index;
    }

    public void pop() {
        current--;
        if (current >= 0) {
            min = stack[minIndex[current]]; // 重新设置栈中的最小值
            index = minIndex[current]; // 重置最小值的索引
        }
    }

    public int top() {

        if (current < 0) {
            throw new RuntimeException("No more data");
        }

        return stack[current];
    }

    public int getMin() {
        if (current < 0) {
            throw new RuntimeException("No more data");
        }

        return stack[minIndex[current]];
    }
}
*/

