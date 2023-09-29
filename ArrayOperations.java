package Arrays;


import java.util.Scanner; 

public class ArrayOperations { 
 static Scanner sc = new Scanner(System.in); 
 
 public static void main(String[] args) { 
  System.out.println("Enter the size of Array: "); 
  int size = sc.nextInt(); 
  int a[] = new int[size]; 
 
  // taking elements from user 
  for (int i = 0; i < a.length; i++) { 
   System.out.println("Enter element " + (i + 1)); 
   a[i] = sc.nextInt(); 
  } 
 
   
  while (true) { 
   System.out.println(" 1.Insert \n 2.Delete \n 3.Update \n 4.Sort \n 5.Search \n 6.Reverse \n" 
     + " 7.Display \n 8.Min \n 9.Max \n 10.isEmpty \n 11.Exit"); 
   int option = sc.nextInt(); 
   switch (option) { 
   case 1: { 
    System.out.println("Enter the new element: "); 
    int ele = sc.nextInt(); 
    System.out.println("Enter the position: "); 
    int pos = sc.nextInt(); 
    a = insert(a, ele, pos); 
    display(a); 
    break; 
   } 
   case 2: { 
    System.out.println("Enter the element to delete: "); 
    int ele = sc.nextInt(); 
    a = delete(a, ele); 
    display(a); 
    break; 
   } 
   case 3: { 
    System.out.println("Enter the element to update: "); 
    int ele = sc.nextInt(); 
    a = update(a, ele); 
    display(a); 
    break; 
   } 
   case 4: { 
    a = sort(a); 
    display(a); 
    break; 
   } 
   case 5: { 
    System.out.println("Enter the element to search: "); 
    int ele= sc.nextInt(); 
    if(search(a,ele)==-1) { 
     System.out.println("Element is not present."); 
    } 
    else { 
     System.out.println("Element is found at index " + search(a,ele)); 
    } 
    break; 
   } 
   case 6: { 
    a = reverse(a); 
    display(a); 
    break; 
   } 
   case 7: { 
    display(a); 
    break; 
   } 
   case 8: { 
    min(a); 
    break; 
   } 
   case 9: { 
    max(a); 
    break; 
   } 
   case 10: { 
    isEmpty(a); 
    break; 
   } 
   case 11: { 
    System.exit(0); 
     
    break; 
   } 
   default: { 
    System.out.println("Invalid option choose valid option."); 
   } 
   } 
  } 
 } 
 
 public static int[] insert(int[] a, int ele, int pos) { 
  if (pos > a.length + 1 || pos <= 0) { 
   System.out.println("Insetion is not Possible Choose another option."); 
   return a; 
  } else { 
   int res[] = new int[a.length + 1]; 
   for (int i = 0, j = 0; i < res.length; i++) { 
    if (i == pos - 1) { 
     res[i] = ele; 
    } else { 
     res[i] = a[j++]; 
    } 
   } 
   return res; 
  } 
 
 } 
 
 public static int[] delete(int a[], int ele) { 
  int ind = search(a, ele); 
  if (a.length == 0) { 
   System.out.println("Array is empty Deletion is not possible"); 
   return a; 
  } else if (ind == -1) { 
   System.out.println("Deletion is not possible...since deletion ele is not present."); 
   return a; 
  } else { 
   int res[] = new int[a.length - 1]; 
   for (int i = 0, j = 0; i < a.length; i++) { 
    if (i != ind) { 
     res[j++] = a[i]; 
    } 
   } 
   return res; 
  } 
 
 } 
 
 public static int[] update(int a[], int ele) { 
  if (a.length == 0) { 
   System.out.println("Array is empty"); 
   return a; 
  } else { 
   if (search(a, ele) == -1) { 
    System.out.println("Replacing element is not present...."); 
    return a; 
   } else { 
    System.out.println("Enter the new element: "); 
    int new_ele = sc.nextInt(); 
    for (int i = 0; i < a.length; i++) { 
     if (a[i] == ele) { 
      a[i] = new_ele; 
     } 
    } 
    return a; 
   } 
  } 
 } 
 
 public static int[] sort(int a[]) { 
  for(int i=0;i<a.length-1;i++) { 
   int min = i; 
   for(int j=i+1;j<a.length;j++) { 
    if(a[min]>a[j]) { 
     min = j; 
    } 
   } 
   int temp = a[i]; 
   a[i] = a[min]; 
   a[min]=temp; 
  } 
  return a; 
 } 
  
 public static int search(int a[], int ele) { 
  for (int i = 0; i < a.length; i++) { 
   if (a[i] == ele) 
    return i; 
  } 
  return -1; 
 } 
  
 public static int[] reverse(int a[]) { 
  int rev[] = new int[a.length]; 
  for(int i=0,j=a.length-1;i<a.length;i++) { 
   rev[j--]=a[i]; 
  } 
  return rev; 
 } 
  
  
 
 public static void display(int a[]) { 
  for (int i = 0; i < a.length; i++){ 
   System.out.print(a[i] + " "); 
  } 
  System.out.println(); 
 } 
  
 public static void min(int[] a) { 
  if(a.length==0) { 
   System.out.println("Array is empty please insert elements."); 
  } 
  else { 
   int min=a[0]; 
   for(int i=1;i<a.length;i++) { 
    if(min>a[i]) { 
     min = a[i]; 
    } 
   } 
   System.out.println("Minimum element in array is " + min); 
  } 
 } 
  
 public static void max(int a[]) { 
  if(a.length==0) { 
   System.out.println("Array is empty please insert elements."); 
  } 
  else { 
   int max=a[0]; 
   for(int i=1;i<a.length;i++) { 
    if(max<a[i]) { 
     max = a[i]; 
    } 
   } 
   System.out.println("Maximum element in array is " + max); 
  } 
 } 
  
 public static void isEmpty(int a[]) { 
  if(a.length==0) { 
   System.out.println("The array is empty please insert elements."); 
  } 
  else { 
   System.out.println("Array is not empty."); 
  } 
 } 
 
  
 
}
