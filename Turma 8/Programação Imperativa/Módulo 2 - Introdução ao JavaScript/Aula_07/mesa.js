// Ex1

!true //false
!false //true
!!false // false
!!true // true
!1 // false
!!1 // true
!0 // true
!!0 // false
!!'' // false

console.log(!!false)
console.log()
console.log(!!true)
console.log()
console.log(!1)
console.log()
console.log(!!1)
console.log()
console.log(!0)
console.log()
console.log(!!0)
console.log()
console.log(!!'')
console.log()

let x = 5
let y = 9

x < 10 && x !== 5 // false
x > 9 || x === 5 // true
!(x === y) // true

console.log(x < 10 && x !== 5)
console.log()
console.log(x > 9 || x === 5)
console.log()
console.log(!(x === y))
console.log()
// Ex2

x = 10
y = 'a'

y === 'b' || x >= 10 // true

console.log(y === 'b' || x >= 10)
console.log()

x = 3
y = 8

!(x == '3' || x === y) && !(y !== 8 && x <= y) // false

console.log(!(x == '3' || x === y) && !(y !== 8 && x <= y))
console.log()

let str = ''
let msg = 'haha!'
let eBonito = 'false'

!((str || msg) && eBonito) // false

console.log(!((str || msg) && eBonito))
console.log()
