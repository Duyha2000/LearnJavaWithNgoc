class Person:
    def __init__(self, name, age, address):
        self.name = name
        self.age = age
        self.address = address

    def display(self):
        print("Name:", self.name)
        print("Age:", self.age)
        print("Address:", self.address)


class Student(Person):
    def __init__(self, name, age, address, gpa):
        super().__init__(name, age, address)
        self.gpa = gpa

    def display(self):
        super().display()
        print("gpa : ", self.gpa)


class Teacher(Person):
    def __init__(self, name, age, address, salary):
        super().__init__(name, age, address)
        self.salary = salary

    def display(self):
        super().display()
        print("salary : ", self.salary)


ngoc = Student("Ngoc", 18, "Vĩnh Phúc", 3.5)
ngoc.display()
