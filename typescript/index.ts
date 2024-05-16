/**
 * The program is the classic
 * hourglass program
 *
 * By: Michael Zagon
 * Version: 1.0
 * Since: 2024-05-15
 */

import createPrompt from 'bun-promptx'

// Hourglass Function
function asteriskGlass(userInput: number, spaces: number): void {
  // these are the variables
  let hourGlass = ''

  // this is the loop for the blankspace
  for (let counter1 = 0; counter1 < spaces; counter1++) {
    hourGlass += ' '
  }

  // this is where the * are placed
  for (let counter2 = 0; counter2 < userInput; counter2++) {
    hourGlass += '* '
  }
  console.log(hourGlass)

  // recurrsive formula.
  if (userInput > 1) {
    asteriskGlass(userInput - 1, spaces + 1)
  }
  console.log(hourGlass)
}

// Input
const userNum = Number(prompt('Enter desired size of Asterisks Hourglass: '))
console.log('')

// Checks inputs validity
if (isNaN(userNum)) {
  console.log('Invalid Input')
} else if (userNum <= 0) {
  console.log('Invalid Input')
} else {
  asteriskGlass(userNum, 0)
}
console.log('\nDone.')
