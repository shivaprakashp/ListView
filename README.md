# ListView
## ListViewOne
Before start with recyclerView, first we used to understand about ListView. Let's we begin with listview with BaseAdapter.
ListView is one of the most used API in android. ListViews are used in Android to show all items in a scrollable list of views. 

Transform Array or Collection of Java Object to list of Android Views. In other terms if we would say Non-UI element to UI elements in android. Adapters are used to achieve the Non-UI elements to UI elements.

As we defined normal listview with ArrayAdpater. 
Defined ListUtils class is used to get array of string values from strings.xml files.
Default, Android listview layout is used to show basic listview works without define any custom adapter.
This works with single unit of string values. But, it won't work with custom layout. 
Custom layout with BaseAdapter will learn in next example.

## ListViewTwo
As we already know about simpleListView. But, if we have complex layout, which could not possible to achieve through android default
listview.

To avoid the problem, android provides api called as BaseAdapter. How this BaseAdapter works?
Procedure is used to implement BaseAdapter.
1. Create Custom Layout for row items in ListView.
2. Extend BaseAdapter and override the methods of BaseAdapter api.
3. use Custom BaseAdapter to inflate new layout.
4. Set custom BaseAdapter to ListView.

Look onto the ListViewTwo example for further implementation.
Created different package to manage code in proper manner to understand easily.

- Created UserListAdapter which extends BaseAdapter, override the default methods of BaseAdapter.
- getCount(), getItem(), getView(), getItemId() these methods has to override.
- BaseAdapter has to know what it inflates, it used to know list of objects. That is the pass the list of objects in constructor of
a adapter class. Initialise Context and list of objects in constructor.
- getCount() return array size.
- getItem( int i) returns the object at the i-th position of list.
- getItemid(int i) return index of list.
- getView(int i, View view, ViewGroup viewGroup), real implementation of adapter starts at here. This is where individual views
would get inflated.
- In adapter, first we are inflating the view layout in the LayoutInflator. Context is used to inflate the layout.
- that we get the items using position. Users users = usersList.get(position);
- than use the object to set the value to particular textview.

Till now it is easy to understand, but the major drawback of this implementation is to consume more memory. Look out the below line
Log.i(TAG, "Position : "+position+" - View : "+convertView);

In the above log, we are trying display view and position. Once we launch the layout, it creates number of visible list item views and
display number of position.
On while scroll it creates as many views and the total available items position.
Major drawback is it creates as many views, even though total items are 16, but it creates new view whenever user scrolls.
while doing this, it consumes more memory. Android creates separate memory space while each scroll.






