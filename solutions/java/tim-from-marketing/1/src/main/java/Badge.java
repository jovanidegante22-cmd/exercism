class Badge {
    public String print(Integer id, String name, String department) {
        String employeeName = (name != null) ? name : "null";
        String dept = (department != null) ? department.toUpperCase() : "OWNER";

        if (id != null) {
            return "[" + id + "] - " + employeeName + " - " + dept;
        } else {
            return employeeName + " - " + dept;
        }
    }
}
