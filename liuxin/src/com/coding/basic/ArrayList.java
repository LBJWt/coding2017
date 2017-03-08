package com.coding.basic;


public class ArrayList implements List {


	private int size = 0;
	
	private Object[] elementData =new Object[100] ;

	public void add(Object o){
		elementData[size++] = o;
	}

	public void add(int index, Object o){
		//再插入之前先检查索引是否越界
		checkIndex(index);
		System.arraycopy(elementData, index, elementData, index + 1, size - index);
		elementData[index] = o;
		size++;
	}
	//检查索引是否越界
	public  void checkIndex(int index){
		if(index>=size || index <0){
			throw new IndexOutOfBoundsException("数组越界了！size："+size);
		}
	}
	public Object get(int index){
		//在取值之前先检查索引是否越界
		checkIndex(index);
		return elementData[index];
	}
	//删除返回删除元素
	public Object remove(int index){
		checkIndex(index);
		Object o =elementData[index-1];
		if (size-index-1>0){
			//使用数组的复制函数，先将数组要删除元素前面的元素不变，后面的元素进行复制覆盖即可
			System.arraycopy(elementData, index+1, elementData, index, size-index-1);
			size--;
		}
		return o;
	}
	
	public int size(){
		return size;
	}
	
	public Iterator iterator(){
		return null;
	}
	
}
