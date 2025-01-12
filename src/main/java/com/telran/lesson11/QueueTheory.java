package com.telran.lesson11;

import java.util.Queue;

/**
 * Queue - FIFO, first input, first output
 * Первый пришел первый ушел
 * LinkedList, PriorityQueue
 * PriorityBlockingQueue
 *
 * Queue - интерфейс, его наследует интерфейс Deque
 * Deque - очередь, которая двунаправленная
 * Queue - помещаем элементы с одной стороны, забираем с другой
 * Deque - можем помещать элементы и забирать с обоих сторон
 *
 * Иерархия:
 * Интерфейсы: Iterable -> Collection -> Queue -> Deque
 * Реализации: LinkedList, ArrayDeque
 *
 * Queue :
 * offer - add element,
 * peek, (element) - return element, but not delete
 * poll, (remove) - return element and delete from queue
 *
 * Основано на массиве: ArrayDeque
 * Основано на связном списке: LinkedList
 * Очередь с приоритетом: PriorityQueue
 *
 */
public class QueueTheory {

}
