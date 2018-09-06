pragma solidity^0.4.0;

contract counter {
    uint private counter;
    address private minter;
    
    constructor() public {
        minter = msg.sender;
    }
    
    function Inc() public {
        require(msg.sender == minter && counter + 1 > counter);
        counter++;
    }
    
    function getCounter() public view returns (uint _counter) {
        _counter = counter;
    }
}

