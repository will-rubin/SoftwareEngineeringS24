gipackage Server.StorageSystem;

public class StorageSystem {
    /* What the storage system needs to be able to do
     */
    //check if user-specified input is readable
    //check if user-specified output source is good,
    //then initialize output source
    //convert data to different readable and writable formats
    //write data to output source, close output source
    //cache data to connect or write to sources more quickly?
    public void testStorageSystem(StorageSystem storage) {
        StorageSystemResponse responseData = EngineController.storeData(new StorageSystemRequest());
        // retrieve the data
        LoadResponse dataLoad = EngineController.loadData(LoadResponse.getKeyData());
    }
    public interface DataStore
    {
        EngineResponse storeData(EngineControllerRequest newRequest);
        LoadResponse loadData(KeyStorage newKey);
    }
}

/*
    An API between the data storage system and the compute engine. The data
    storage system is responsible for reading from and writing to user-specified input
    and output sources.
 */
