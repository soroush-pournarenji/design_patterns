public class Connection {
    private static Connection connection;
    private Connection(){
        if(connection !=null){
            throw new InstantiationError( "Creating of this object is not allowed." );
        }
    }
    public static Connection getInstance(){
        if(connection == null){
            synchronized (Connection.class){
                if(connection == null){
                    connection=new Connection();
                }
            }
        }
        return connection;
    }
}
