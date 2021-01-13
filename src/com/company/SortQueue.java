package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class SortQueue {

    public static void main(String args[]) {
        Queue<Integer> target = new LinkedList<>();
        target.add(3);
        target.add(1);
        target.add(6);
        target.add(7);
        target.add(2);
        target.add(9);

        //SortQueueUsingExtraQueue(target);
        System.out.println(target);
        sortQueue(target);
        System.out.println(target);
    }

    public static void sortQueue(Queue<Integer> list)
    {
        for(int i = 1; i <= list.size(); i++)
        {
            int min_index = minIndex(list,list.size() - i);
            System.out.println("Min_index from function is: "+min_index);
            insertMinToRear(list, min_index);
            System.out.println("############");
        }
        //list.
    }

    public static void insertMinToRear(Queue<Integer> list,
                                       int min_index)
    {
        int min_value = 0;
        int s = list.size();
        for (int i = 0; i < s; i++)
        {
            int current = list.peek();
            System.out.println("Value of current is : "+current);
            System.out.println("Value of I is "+i);
            list.poll();
            if (i != min_index) {
                list.add(current);
                System.out.println("List in if condition : "+list);
            }
            else
                min_value = current;

            System.out.println("Min Value is: "+min_value);
        }
        list.add(min_value);
        System.out.println("After adding Minimum Value list is : "+list);
    }

    public static int minIndex(Queue<Integer> list,
                               int sortIndex)
    {
        int min_index = -1;
        int min_value = Integer.MAX_VALUE;
        int s = list.size();
        for (int i = 0; i < s; i++)
        {
            int current = list.peek();
            System.out.println("Value of current is: "+current);

            // This is dequeue() in Java STL
            list.poll();

            // we add the condition i <= sortIndex
            // because we don't want to traverse
            // on the sorted part of the queue,
            // which is the right part.
            System.out.println("Min_value is : "+min_value);
            System.out.println("Sort Index is : "+sortIndex);
            System.out.println("Value of I is "+i);
            if (current <= min_value && i <= sortIndex)
            {
                min_index = i;
                min_value = current;
            }
            list.add(current);
            System.out.println("List is : "+list);
        }
        return min_index;
    }

    private static void SortQueueUsingExtraQueue(Queue<Integer> target)
    {
        if (target == null ) return;

        Queue tmpQueue = new LinkedList<Integer>(); // the second Queue, this queue contains the sorted part of the target queue.
        int queueLength = target.size(); // length of the target queue.
        int lastInput = target.peek(); // element at the top of the "sorted" queue.
        int processedCount = 0; // currently processed item count.
        boolean sorted = false;

        while (!sorted)
        {
            // if the element element is lesser than the item on the top of the sorted queue, we move it from the target queue and push it into the sorted queue.
            System.out.println("Value of last input is: "+lastInput);
            System.out.println("Value of target.peek() is: "+target.peek());
            if (lastInput >= target.peek())
            {
                lastInput = target.remove();
                tmpQueue.add(lastInput);
            }

            // the poping element is bigger than the top element on the sorted queue, we put it back to the bottom of the queue and will process it later.
            else
            {
                target.add(target.remove());
            }

            // continue if we still have item to process.
            if (++processedCount != queueLength) continue;

            // once all item are processed, we check the length of the sorted queue, if the # of item equals the length of the orignal queue, means the sort is done.
            if (tmpQueue.size() == queueLength)
            {
                sorted = true;
            }

            // we dump all the elements to the target queue, if the sort is done, target queue ends up with all the element sorted, if not, target queue ends with element that is parcially sorted.
            // We will process on until all the elements are sorted.
            while (tmpQueue.size() > 0)
            {
                target.add((Integer) tmpQueue.remove());
                lastInput = target.peek(); // don't forget to reset lastInput.
            }

            processedCount = 0;
            //System.out.println("Target Queue is: "+target);
            //System.out.println("TMP Queue is: "+tmpQueue);
            //System.out.println("###############");
        }

    }
}
