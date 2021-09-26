1. Set only stores unique values 
2. No duplicates can be stored in Set
3. Set does not care about position of element, so we cannot add or remove based on position


Hashing
1. Hashing makes searching , adding , removing  of elements easier
2. Hashtable makes use of hashing function to stores values in table
3. Hashing function steps
   1. Assume you want to store 14 in table
   2. Divide 14 by 13 the reminder will be 1
   3. So 14 will be stored at index 1
   4. Now suppose you want to store 27 in Hashing
   5. Divide 27 by 13 the reminder in 1
   6. But 14 is already present at 1 
   7. How will we store 27
   8. Answer is it will add it into list using linked list concept
4. In Java we implement hashing function using hashcode
5. there is function named hashcode(), that hashcode() is used to determine where it will be stored


TreeSet
1. Stores elements in sorted order
2. All the elements higher than the number are stored on right-hand side of the tree
3. All the elements which are lesser than the number are stored on left-hand side of the tree
4. Smallest element in the tree is the element on the left-hand side of the tree
5. Largest element in the tree is the element on the right-hand side of the tree
6. Search , Delete , Add operations are not too costly in tree data structures


1. If we want to get unique elements only we will use Set
2. If we want to get unique elements in sorted manner , we will use Tree Set
3. If we care about the order in which elements were added in Set , we will use Linked Hash set
