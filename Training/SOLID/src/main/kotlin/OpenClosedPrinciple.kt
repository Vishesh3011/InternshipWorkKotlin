//// OCP states that software entities (such as classes, modules, functions, etc.) should be open for extension but closed for modification
//// i.e. you should be able to add new functionality to an entity without changing exsiting code
//// for example below code has a lot of boiler plate code which can be hard to understand and also reuse and any change can result
//// in change in existing code
//
//class VehicleInsCust {
//    fun isLoyalCustomer(): Boolean{
//        return true
//    }
//}
//
//class LifeInsCust {
//    fun isLoyalCustomer(): Boolean{
//        return true
//    }
//}
//
//class HomeInsCust {
//    fun isLoyalCustomer(): Boolean{
//        return true
//    }
//}
//
//class InsuranceCompany{
//    fun discount(vehicle: VehicleInsCust): Int{
//        return if(vehicle.isLoyalCustomer()) 10 else 7
//    }
//
//    fun discount(life: LifeInsCust): Int {
//        return if(life.isLoyalCustomer()) 20 else 12
//    }
//
//    fun discount(home: HomeInsCust): Int {
//        return if(home.isLoyalCustomer()) 10 else 8
//    }
//}

// the above code can be reduced by using abstraction
// we can use interface to implement abstraction and override the function isLoyalCustomer

interface Customer{
    fun isLoyalCustomer(): Boolean = true
}

// hence other classes can inherit from the abstract class Customer

class VehicleInsCust: Customer {
    override fun isLoyalCustomer(): Boolean{
        return true
    }
}

class LifeInsCust: Customer {
    override fun isLoyalCustomer(): Boolean{
        return true
    }
}

class HomeInsCust: Customer {
    override fun isLoyalCustomer(): Boolean{
        return true
    }
}

// hence this function can be used for extension for other categories but closed for modification
class InsuranceCompany{
    fun discount(customer: Customer): Int{
        return if(customer.isLoyalCustomer()) 35 else 25
    }
}