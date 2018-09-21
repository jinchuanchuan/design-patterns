package templateMethod.demo02.abstractClass;

/**
 * @description:
 * @author: jcc
 * @date: 2018-09-21 16:40
 * @Modified By:
 */
public abstract class AbstractSort {
    protected abstract void sort(int[] array);

    public void showSortResult(int[] array) {
        this.sort(array);
        System.out.printf("排序结果：");
        for (int i = 0; i < array.length; i++ ) {
            System.out.printf("%3s", array[i]);
        }
    }
}
