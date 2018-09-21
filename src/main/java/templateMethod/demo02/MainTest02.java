package templateMethod.demo02;

import templateMethod.demo02.abstractClass.AbstractSort;
import templateMethod.demo02.implementClass.ConcreteSort;

/**
 * @description:
 * @author: jcc
 * @date: 2018-09-21 16:31
 * @Modified By:
 */
public class MainTest02 {
    public static int[] a = { 10, 32, 1, 9, 5, 7, 12, 0, 4, 3 }; // 预设数据数组

    public static void main(String[] args) {

        AbstractSort s = new ConcreteSort();
        s.showSortResult(a);

    }
}
