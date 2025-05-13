function fetchUserData(){
    try {
        let success = Math.random() >.5;

        setTimeout(() => {
            if (!success) {
                throw new Error("Failed to fetch uer data. Network Error");
            } else {
                console.log("User data fetched successfully");
            }
        }, 1000);
    } catch (error) {
        console.log("Error: ", error.message);
    } finally {
        console.log("Fetching user operations complete"); 
    }
}

fetchUserData();